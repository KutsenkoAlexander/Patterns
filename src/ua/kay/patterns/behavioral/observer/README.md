# Наблюдатель (Observer)
**Цель:**
Определение зависимости "один ко многим" между объектами.

**Для чего используется:**
Определение зависимости "один ко многим" между объектами таким образом, что при изменении состояния обного объекта
все зависищие от него объекты были уведомлены об этом и обновились.

**Пример использования:**
- когда у модели имеются два аспекта, один из которых зависит от другого. Инкапсулирование этих аспектов 
в разные классы позволяет использовать их независимо друг от друга;
- когда один объект должен оповещать другие и не делать предположение об этих объктах;
- ослабление связи между объектами.
