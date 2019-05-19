from collections import Counter
import string

alphabet = "abcdefghijklmnopqrstuvwxyz"   

test_dups = ["zzz","dog","bookkeeper","subdermatoglyphic","subdermatoglyphics"] 

test_miss = ["zzz","subdermatoglyphic","the quick brown fox jumps over the lazy dog"] 

def histogram(s):
    d = dict()
    for c in s:
        if c not in d:
            d[c] = 1
        else:
            d[c] += 1
    return d
def duplicates(s):
    histogram(s)
    for i in test_dups:
        count = s.count(i)
        if count > 1:
            print(i, 'has duplicate')
            return True
    print(i, 'has no duplicate')
    return False
def missing_letters(alphabet):
    histogram(alphabet)
    for letter in test_miss.ascii_lowercase:
        if letter in alphabet:
            print( letter, 'uses all the letters')
            return True
    print( letter, 'is missing letters')   
    return letter
