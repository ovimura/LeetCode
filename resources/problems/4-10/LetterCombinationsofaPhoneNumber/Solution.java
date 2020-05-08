class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, String> pad = new HashMap<>();
        pad.put(2, "abc");
        pad.put(3, "def");
        pad.put(4, "ghi");
        pad.put(5, "jkl");
        pad.put(6, "mno");
        pad.put(7, "pqrs");
        pad.put(8, "tuv");
        pad.put(9, "wxyz");
        List<String> combinations = new ArrayList<>();
        if(digits.length() == 0)
            return combinations;
        char[] cs = digits.toCharArray();
        List<String> lettersGrp = new ArrayList();
        for(char c: cs){
            lettersGrp.add(pad.get(Character.getNumericValue(c)));
        }
        combinations.add("");
        for (int ii=0; ii<lettersGrp.size(); ii++) {
            ArrayList<String> strs = new ArrayList<>();
            for (int i = 0; i < combinations.size(); i++) {
                for (int j = 0; j < lettersGrp.get(ii).length(); j++) {
                    strs.add(combinations.get(i) +
                            Character.toString(lettersGrp.get(ii).toCharArray()[j]));
                }
            }
            combinations.clear();
            combinations.addAll(strs);
        }
        return combinations;
    }
}