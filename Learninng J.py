
dictionary = {1 : [10,20,30], 2: [20,30,40], 3: [50,60,70], 4: [100,40,20], 'five': ['hello','Kudzanai','Gomera']}
def invert_dict(d):
    #creating a new dict
    inverse = dict() 
    for key in d:
        #iterating through the list saved in the dict
        for val in d[key]:
            #checking the key in the new dict
            if val not in inverse: 
                inverse[val] = [key] 
            else: 
                inverse[val].append(key)
    print('the original dictionary: ', dictionary)
    print('======================================')
    print('the inverted dict: ', inverse)
    # can also return inverse but is being printed on top
