import unittest
from Roman import RomanNumeralConverter

class RomanNumeralConverterTest(unittest.TestCase):
	# prueba que al convertir el numero romano M se devuelve el valor 1000
	def test_parsing_millenia(self):
		value = RomanNumeralConverter("M")
		self.assertEquals(1000, value.convert_to_decimal())
	# prueba que al convertir el numero romano C se devuelve el valor 100
	def test_parsing_century(self):
		value = RomanNumeralConverter("C")
		self.assertEquals(100, value.convert_to_decimal())
	# prueba que al convertir el numero romano L se devuelve el valor 50
	def test_parsing_half_century(self):
		value = RomanNumeralConverter("L")
		self.assertEquals(50, value.convert_to_decimal())
	# prueba que al convertir el numero romano X se devuelve el valor 10
	def test_parsing_decade(self):
		value = RomanNumeralConverter("X")
		self.assertEquals(10, value.convert_to_decimal())
	# prueba que al convertir el numero romano V se devuelve el valor 5
	def test_parsing_half_decade(self):
		value = RomanNumeralConverter("V")
		self.assertEquals(5, value.convert_to_decimal())
	# prueba que al convertir el numero romano I se devuelve el valor 1
	def test_parsing_one(self):
		value = RomanNumeralConverter("I")
		self.assertEquals(1, value.convert_to_decimal())
	# prueba que al convertir una cadena vacia se devuelve el valor 0
	def test_empty_roman_numeral(self):
		value = RomanNumeralConverter("")
		self.assertTrue(value.convert_to_decimal() == 0)
		self.assertFalse(value.convert_to_decimal() > 0)
	# prueba que al converter el valor none da error
	def test_no_roman_numeral(self):
		value = RomanNumeralConverter(None)
		self.assertRaises(TypeError, value.convert_to_decimal)

if __name__ == "__main__":
    #dado que se usan un loader y un runner, el test puede ser mas verbose
    
    #se genera una suite usando el loader
	suite = unittest.TestLoader().loadTestsFromTestCase(RomanNumeralConverterTest)
    
    #se ejecuta la suite
	unittest.TextTestRunner(verbosity=2).run(suite)


