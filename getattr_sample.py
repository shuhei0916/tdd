class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
person = Person("Alice", 30)
name = getattr(person, "name")
print("name: ", name)

age = getattr(person, "age")
print("age: ", age)