### Переписать код в соответствии с Single Responsibility Principle:
```
   from datetime import date

   class Employee:
      def init(self, name, dob, base_salary):
         self.name = name
         self.dob = dob
         self.base_salary = base_salary
   ​
      def get_emp_info(self):
         return f"name - {self.name} , dob - {self.dob}"
   ​
      def calculate_net_salary(self):
         tax = int(self.base_salary * 0.25) # рассчитать налог другим способом
         return self.base_salary - tax

```
  
### Подсказка: вынесите метод calculateNetSalary() в отдельный класс

## Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
```
   class SpeedCalculation:
      def calculate_allowed_speed(self, vehicle):
         if vehicle.get_type().lower() == "car":
            return vehicle.get_max_speed() * 0.8
         elif vehicle.get_type().lower() == "bus":
            return vehicle.get_max_speed() * 0.6
         return 0.0
   ​
   class Vehicle:
      def init(self, max_speed, type):
         self.max_speed = max_speed
         self.type = type
   ​
      def get_max_speed(self):
         return self.max_speed
   ​
      def get_type(self):
         return self.typev

```
### Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
   
## Переписать код в соответствии с Interface Segregation Principle:
```
from abc import ABC, abstractmethod
import math
   ​
   class Shape(ABC):
      @abstractmethod
      def area(self):
         pass
   ​
      @abstractmethod
      def volume(self):
         pass
   ​
   class Circle(Shape):
      def init(self, radius):
         self.radius = radius
   ​
      def area(self):
         return 2 * math.pi * self.radius
   ​
      def volume(self):
         raise NotImplementedError("Circle does not have volume")
   ​
   class Cube(Shape):
      def init(self, edge):
         self.edge = edge
   ​
      def area(self):
         return 6 * self.edge * self.edge
   ​
      def volume(self):
         return self.edge * self.edge * self.edge

```
### Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

## Переписать код в соответствии с Liskov Substitution Principle:
```
class Rectangle:
   def init(self):
      self.width = 0
      self.height = 0
   ​
   def setWidth(self, width):
      self.width = width
   ​
   def setHeight(self, height):
      self.height = height
   ​
   def area(self):
      return self.width * self.height
   ​
   ​
class Square(Rectangle):
   def setWidth(self, width):
      self.width = width
      self.height = width
   ​
   def setHeight(self, height):
      self.width = height
      self.height = height
```
## Переписать код в соответствии с Dependency Inversion Principle:
```
class Car:
   def init(self, engine):
      self.engine = engine

   def start(self):
      self.engine.start()
​
class PetrolEngine:
   def start(self):
      pass
```
   
### Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
