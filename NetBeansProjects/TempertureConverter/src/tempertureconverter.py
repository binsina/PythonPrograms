
def TemperatureConverter():
    celsius = float(input('Enter degree Celsius: '))

# calculate fahrenheit
    fahrenheit = (celsius * 1.8) + 32
    print('%s degree Celsius is equal to %s degree Fahrenheit' %(celsius,fahrenheit))

TemperatureConverter()