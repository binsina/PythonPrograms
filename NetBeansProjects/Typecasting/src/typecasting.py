#to separate the input by type, int, str
#the problem with this is that the user has to input quotoation marks 
#around the string type- it defeats the purpose of being input-smart

#myList=input("Please enter your list separted by a comma:")

import unittest

class TestStringMethods(unittest.TestCase):

  def test_upper(self):
      self.assertEqual('foo'.upper(), 'FOO')

  def test_isupper(self):
      self.assertTrue('FOO'.isupper())
      self.assertFalse('Foo'.isupper())

  def test_split(self):
      s = 'hello world'
      self.assertEqual(s.split(), ['hello', 'world'])
      # check that s.split fails when the separator is not a string
      with self.assertRaises(TypeError):
          s.split(2)
 
  '''def test_Data(self):
     data = ['hello','world',1,2,3, None]
     self.assertEqual(
     filter_by_type(data, basestring),
     ['hello','world'])
        
     self.assertEqual(
     filter_by_type(data, numbers.Number),
     [1,2,3])'''


if __name__ == '__main__':
    unittest.main()

