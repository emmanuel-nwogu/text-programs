
vowels = ['a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U']
toBeConverted = input("Enter the string to be converted to pig latin >>>  ")

pigLatin = ""
toBeConvertedLength = len(toBeConverted)

for i in range(toBeConvertedLength-1):
    if toBeConverted[i] in vowels:
        pigLatin += toBeConverted[i:toBeConvertedLength] + toBeConverted[0:i] + "ay"
        break
print(pigLatin)    
