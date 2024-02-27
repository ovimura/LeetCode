
import unittest


class Convert:
    """
        Input: Celsius = 36.50
        Output: [309.65000,97.70000]
        Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
    """
    def Convert(self):
        self.C = 0
        self.K = 0
        self.F = 0

    def convert_C_to_K_and_F(self, degree) -> [float, float]:
        self.C = degree
        self.K = round(self.C + 273.15, 5)
        self.F = round(self.C * 1.80 + 32.00, 5)
        return [self.K, self.F]


class TestClassName(unittest.TestCase):
    def setUp(self):
        self.converter_from_Celsius_to_Kevin_and_Fahrenheit = Convert()

    def test_convert(self):
        self.assertEqual(self.converter_from_Celsius_to_Kevin_and_Fahrenheit.convert_C_to_K_and_F(36.50),
                         [309.65000, 97.70000])
#
#     def test_bar(self):
#         self.assertTrue("BAR".methods())
#         self.assertFalse("bar".methods())
#
#     def test_baz(self):
#         baz = "hello world"
#         self.assertEqual(baz.methods(), expected_return_value)
#         with self.assertRaises(TypeError):
#             baz.methods(bad_type_input)


# class TestClassName(unittest.TestCase):
#     def setUp(self):
#         self.variable_name = ""
#
#     def test_foo(self):
#         self.assertEqual("foo".methods(), expected_return_value)
#
#     def test_bar(self):
#         self.assertTrue("BAR".methods())
#         self.assertFalse("bar".methods())
#
#     def test_baz(self):
#         baz = "hello world"
#         self.assertEqual(baz.methods(), expected_return_value)
#         with self.assertRaises(TypeError):
#             baz.methods(bad_type_input)





if __name__ == "__main__":
    unittest.main()

