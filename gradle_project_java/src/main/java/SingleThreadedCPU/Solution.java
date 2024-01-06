package SingleThreadedCPU;

import java.util.*;

//
// Explain the solution: https://www.youtube.com/watch?v=k_gpz-fjXmY
//
// https://leetcode.com/problems/single-threaded-cpu/
// 1834. Single-Threaded CPU
// https://leetcode.com/problems/single-threaded-cpu/
public class Solution {

    public int[] getOrder(int[][] tasks) {

        // pre-processing
        // adding index as third element in the array
        for(int i = 0; i < tasks.length; i++) {
            int[] a = new int[3];
            a[0] = tasks[i][0];
            a[1] = tasks[i][1];
            a[2] = i;
            tasks[i] = a;
        }

        // sorting array based on
        // 1. enqueueTime
        // 2. requiredTime / processingTime
        // 3. index
        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] A, int[] B) {
                for(int i = 0; i < 3; i++) {
                    if(A[i] != B[i]) {
                        return A[i] - B[i];
                    }
                }
                return 0;
            }
        });

        int[] arr = new int[tasks.length];

        // creating priorityQueue for storing our available tasks
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] A, int[] B) {
                for(int i = 1; i < 3; i++) {
                    if(A[i] != B[i]) {
                        return A[i] - B[i];
                    }
                }
                return 0;
            }
        });

        // initializing currentTime as time of the first available task
        long currentTime = tasks[0][0];
        int arr_i = 0, tasks_i = 0;
        while(arr_i < arr.length) {
            while(tasks_i < tasks.length && tasks[tasks_i][0] <= currentTime) {
                queue.add(tasks[tasks_i++]);
            }

            // base case handling
            if(queue.isEmpty()) {
                currentTime = tasks[tasks_i][0];
                queue.add(tasks[tasks_i]);
                tasks_i++;
            }
            int[] cur = queue.remove();
            arr[arr_i++] = cur[2]; // storing index
            currentTime += cur[1];
        }

        return arr;
    }

    public int[] getOrder_slow(int[][] tasks) {
        int[] processed_order = new int[tasks.length];
        int completed = 0;
        boolean idle = true;
        int time = 1;
        PriorityQueue<Integer[]> tasks_waiting = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[2].equals(o2[2])) {
                    return Integer.compare(o1[0], o2[0]);
                } else
                    return Integer.compare(o1[2], o2[2]);
            }
        });
        int i = 0;
        for(int [] t: tasks) {
            Integer[] a = new Integer[4];
            a[0] = i;
            a[1] = t[0];
            a[2] = t[1];
            a[3] = -1;
            tasks_waiting.offer(a);
            i++;
        }

        Integer[] proc = null;

        while(completed != processed_order.length) {
            // add the available tasks
            while(tasks_waiting.size()>0 && tasks_waiting.peek()[1] == time) {
                pq.offer(tasks_waiting.poll());
            }

            // available <task_order, enqueueTime, processingTime, start_processing_time>
            // choose one with the shortest processing time, and smallest index
            if(idle && pq.size() != 0) {
                idle = false;
                proc = pq.poll();
                proc[3] = time;
            }
            if(proc != null) {
                if((time-proc[3]) == proc[2]) {
                    idle = true;
                    processed_order[completed++] = proc[0];
                    if(pq.size()>0) {
                        idle = false;
                        proc = pq.poll();
                        proc[3] = time;
                    }
                }
            }
            time++;
        }
        return processed_order;
    }

    public int[] getOrder_backup(int[][] tasks) {
        int[] processed_order = new int[tasks.length];
        Arrays.fill(processed_order, -1);
        int completed = 0, j = 0;
        boolean idle = true;
        int time = 1;
        List<int[]> available = new ArrayList<>();
        List<int[]> processing = new ArrayList<>();
        List<int[]> tasks_waiting = new ArrayList<>();
        int i = 0;
        for(int [] t: tasks) {
            int[] a = new int[4];
            a[0] = i;
            a[1] = t[0];
            a[2] = t[1];
            a[3] = -1;
            tasks_waiting.add(a);
            i++;
        }
        Collections.sort(tasks_waiting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        while(completed != processed_order.length) {
            // add the available tasks
//            int i = 0;
//            for(int[] t: tasks) {
//                if(t[0] == time) {
//                    int[] a = new int[4];
//                    a[0] = i;
//                    a[1] = t[0];
//                    a[2] = t[1];
//                    a[3] = -1;
//                    available.add(a);
//                }
//                i++;
//            }
            int idx = 0;
            while(tasks_waiting.size() != 0) {
                if(tasks_waiting.get(idx)[1] == time) {
                    available.add(tasks_waiting.get(idx));
                    Collections.sort(available, new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            if (Integer.compare(o1[2], o2[2]) == 0) {
                                return Integer.compare(o1[0], o2[0]);
                            } else
                                return Integer.compare(o1[2], o2[2]);
                        }
                    });
                    tasks_waiting.remove(idx);
                    continue;
                } else
                if(tasks_waiting.get(idx)[1] > time ) {
                    break;
                }
                idx++;
            }

            // available <task_order, enqueueTime, processingTime, start_processing_time>
            // choose one with the shortest processing time, and smallest index
            if(idle && available.size() != 0) {
                idle = false;
                // removing the processing task from available tasks list
//                Collections.sort(available, new Comparator<int[]>() {
//                    @Override
//                    public int compare(int[] o1, int[] o2) {
//                        if(Integer.compare(o1[2], o2[2]) == 0) {
//                            return Integer.compare(o1[0], o2[0]);
//                        } else
//                            return Integer.compare(o1[2], o2[2]);
//                    }
//                });
                // choose the smallest index (i)
                int[] t = available.remove(0);
                t[3] = time;
                processing.add(t);
            }


            int re = 0;
            while(processing.size() != 0) {
//                System.out.println(time + "-" + ta[3] + "-" + ta[2]);
                int[] p = processing.get(re);
                if((time - p[3]) == p[2]) {
                    idle = true;
                    processed_order[j] = p[0];
                    j++;
                    completed++;
                    processing.remove(re);


                    // -------------------------------------------------
                    if(available.size()>0) {
                        // start a new task instantly
                        idle = false;
                        // removing the processing task from available tasks list
//                        Collections.sort(available, new Comparator<int[]>() {
//                            @Override
//                            public int compare(int[] o1, int[] o2) {
//                                if (Integer.compare(o1[2], o2[2]) == 0) {
//                                    return Integer.compare(o1[0], o2[0]);
//                                } else
//                                    return Integer.compare(o1[2], o2[2]);
//                            }
//                        });
                        // choose the smallest index (i)
                        int[] t = available.remove(0);
                        t[3] = time;
                        processing.add(t);
                    }
                    // -------------------------------------------------


                }
                if(re == processing.size()-1)
                    break;
                re++;
            }
            time++;
        }
//        q.forEach(n -> {
//            System.out.println(n[0] + " |" + n[1] + "," + n[2] + " @ " + n[3]);
//        });
//
//        for(int i=0; i<processed_order.length; i++) {
//            System.out.println("processed order: " + processed_order[i]);
//        }
        return processed_order;
    }


    public int[] getOrder_backup_1(int[][] tasks) {
        int[] processed_order = new int[tasks.length];
        //Arrays.fill(processed_order, -1);
        int completed = 0, j = 0;
        boolean idle = true;
        int time = 1;
        List<int[]> available = new ArrayList<>();
        List<int[]> processing = new ArrayList<>();
        List<int[]> tasks_waiting = new ArrayList<>();
        int i = 0;
        for(int [] t: tasks) {
            int[] a = new int[4];
            a[0] = i;
            a[1] = t[0];
            a[2] = t[1];
            a[3] = -1;
            tasks_waiting.add(a);
            i++;
        }
        Collections.sort(tasks_waiting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        while(completed != processed_order.length) {
            // add the available tasks
            int idx = 0;
            while(tasks_waiting.size() != 0) {
                if(tasks_waiting.get(idx)[1] == time) {
                    available.add(tasks_waiting.get(idx));
                    Collections.sort(available, new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            if (Integer.compare(o1[2], o2[2]) == 0) {
                                return Integer.compare(o1[0], o2[0]);
                            } else
                                return Integer.compare(o1[2], o2[2]);
                        }
                    });
                    tasks_waiting.remove(idx);
                    continue;
                } else
                if(tasks_waiting.get(idx)[1] > time ) {
                    break;
                }
                idx++;
            }

            // available <task_order, enqueueTime, processingTime, start_processing_time>
            // choose one with the shortest processing time, and smallest index
            if(idle && available.size() != 0) {
                idle = false;
                // removing the processing task from available tasks list
                // choose the smallest index (i)
                int[] t = available.remove(0);
                t[3] = time;
                processing.add(t);
            }


            int re = 0;
            while(processing.size() != 0) {
                if(processing.size() != 1)
                    System.out.println(processing.size());
                int[] p = processing.get(re);
                if((time - p[3]) == p[2]) {
                    idle = true;
                    processed_order[j] = p[0];
                    j++;
                    completed++;
                    processing.remove(re);

                    // start a new task instantly
                    // -------------------------------------------------
                    if(available.size()>0) {
                        idle = false;
                        // removing the processing task from available tasks list
                        // choose the smallest index (i)
                        int[] t = available.remove(0);
                        t[3] = time;
                        processing.add(t);
                    }
                    // -------------------------------------------------
                }
                if(re == processing.size()-1)
                    break;
                re++;
            }
            time++;
        }

//        for(int ii=0; ii<processed_order.length; ii++) {
//            System.out.println("processed order: " + processed_order[ii]);
//        }
        return processed_order;
    }


    public int[] getOrder_backup_2(int[][] tasks) {
        int[] processed_order = new int[tasks.length];
        int completed = 0;
        boolean idle = true;
        int time = 1;
        List<int[]> available = new ArrayList<>();
        List<int[]> tasks_waiting = new ArrayList<>();
        int i = 0;
        for(int [] t: tasks) {
            int[] a = new int[4];
            a[0] = i;
            a[1] = t[0];
            a[2] = t[1];
            a[3] = -1;
            tasks_waiting.add(a);
            i++;
        }
        Collections.sort(tasks_waiting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int[] proc = null;
        int idx = 0;
        int n = tasks_waiting.size();
        while(completed != processed_order.length) {
            // add the available tasks
            while(n >idx) {
                if (tasks_waiting.get(idx)[1] == time) {
                    available.add(tasks_waiting.get(idx));
                    Collections.sort(available, new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            if (o1[2] == o2[2]) {
                                return Integer.compare(o1[0], o2[0]);
                            } else
                                return Integer.compare(o1[2], o2[2]);
                        }
                    });
                }
                else if (tasks_waiting.get(idx)[1] > time) {
                    break;
                }
                idx++;
            }


            // available <task_order, enqueueTime, processingTime, start_processing_time>
            // choose one with the shortest processing time, and smallest index
            if(idle && available.size() != 0) {
                idle = false;
                proc = available.remove(0);
                proc[3] = time;
            }
            if(proc != null) {
                if((time-proc[3]) == proc[2]) {
                    idle = true;
                    processed_order[completed++] = proc[0];
                    if(available.size()>0) {
                        idle = false;
                        proc = available.remove(0);
                        proc[3] = time;
                    }
                }
            }
            time++;
        }

//        for(int ii=0; ii<processed_order.length; ii++) {
//            System.out.println("processed order: " + processed_order[ii]);
//        }
        return processed_order;
    }
}
