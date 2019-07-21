Шаблон: Мост (Bridge)
===============================================================================================
**Цель:**
Отделить абстракцию от её реализации таким образом, чтобы мы могли изменять независимо друг от друга
и то и другое.

**Для чего используется:**
Для получения преимуществ наследования без потери гибкости.

**Пример использования:**
- предотвращение жесткой привязки абстракции к реализации (например, реализацию необходимо 
  выбрать во время выполнения программы);
- в будущем мы хотим расширять с помощью подклассов и реализацию и абстракцию;
- если изменения в реализации не должны отражаться на клиентских абстракций;
- для разделения одной реализации между несколькими объектами и не показывать это клиенту.