Шаблон: Адаптер (Adapter)
===============================================================================================
Цель:

Преобразование интерфейса одного класса в интерфейс того класса, класса, который необходим клиенту

===============================================================================================

Для чего используется:

Для обеспечения совместной работы классов, интерфейсы которых не совместимы.

===============================================================================================
Пример использования:

- интерфейс класса, который мы хотим использовать не соответствует нашим потребностям;
- необходим класс, который должен взаимодействовать с классами, которые ему неизвестны 
  или не связаны с ним;
- необходимо использовать несколько существующих подклассов, но нецелесообразно использовать
  методы их классов создавая их новые подклассы.

===============================================================================================