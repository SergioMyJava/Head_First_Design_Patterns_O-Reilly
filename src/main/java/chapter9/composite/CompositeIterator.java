package chapter9.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    } //при создании объекта мы передаем итератор(это итератор самого большого меню) и помешаем его в стек

    public Object next() {      //вызывая некст для стека мы проверяем
        if (hasNext()) {       //проверяем наличие элемента перемещаемся в метод ниже
            Iterator<MenuComponent> iterator = stack.peek();//если вдруг hasNext вернул тру , вынимаем последний элемент стэка, а это итератор объекта который содержит все объекты
            MenuComponent component = iterator.next(); //вынимаем из него объект который в списке главного объекта под индексом 0 (в нашем случае их три)
            stack.push(component.createIterator());// запихиваем в стек итератор полученного элемента(мне не понятно это итератор главного объекта или уже второстепенного компонента).
            return component;                       //ну и возвращаем компонент или это лист
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) { //если стек пустой возвращаем false
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek(); //если не пустой то достаем последний элемент из стека, он у нас один, и получаем итератор самого главного меню
            if (!iterator.hasNext()) {//если это не tru "iterator.hasNext()"
                stack.pop();          //то удаляем из стека последний элемент
                return hasNext();       //вызывает снова сам себя - и так будет пока стэк не станет пустым?
            } else {
                return true; //в ином случае вернуть тру
            }
        }
    }
}
