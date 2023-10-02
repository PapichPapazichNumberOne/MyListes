public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.println();
        list.add(8, 4);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                System.out.print("|" + list.get(i) + " ");
        }


//        System.out.println(list + "Лист без всего");// массив без всего
//        list.add(3, 1); // тут просто  есть index это позиция в коде каждая цифру имеет свой идекс= пример
//        // [1,2,3,4] выберем идекс 3 и цифру 1 и будет [1,2,1,3,4]
//        System.out.println(list + "Добавление цифры в нужное место"); // лист с добавление цирфы в нужное место
//        list.remove(2); // ну тут просто удаление позиции
//        System.out.println(list + "Удаление цифры");
//        System.out.println(list);
//        System.out.println(list.contains(2) +"\n" + "проверяет, содержится ли указанное значение в списке");
//
//        System.out.println(list.indexOf(4) + "\n" + "возвращает индекс первого вхождения указанного значения в списке" +
//                "или -1, если значение не найдено,Если он находит это значение, он возвращает позицию (или индекс)\n" +
//                        "этого значения в списке.");
//
//        System.out.println(list.lastIndexOf(1) + "\n" +"\"возвращает индекс последнего вхождения указанного значения\"" +
//                        "в списке или -1, если значение не найдено");
//        System.out.println(list);
//        System.out.println(list.isEmpty() + "\n"+ "пворетяет пустой ли массив");

    }
}



