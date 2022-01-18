# InternetBank
 Pеализация Rest API по работе с банковским счетом. 
 На данном этапе реализовано 3 операции: getMoney, putMoneу, takeMoney.
 
 1. getMoney
 Узнать баланс по ID пользователя;
 ![image](https://user-images.githubusercontent.com/75362472/147476831-3aac5b7c-4b1c-4168-bd14-518672362901.png)
 
 2. putMoneу
 Снятие заданной суммы с баланса пользователя;
 Если ввести сумму превышающую средства на счете, вылетит ошибка: ![image](https://user-images.githubusercontent.com/75362472/147477002-7266e068-f5a7-4fc8-9c6c-26d8799685ca.png)
 
 3. takeMoney
 Пополнение баланса на заданную сумму;
 
 Если ввести несуществующего пользователя, вылетит соответсвующая ошибка: ![image](https://user-images.githubusercontent.com/75362472/147476915-3d3e5433-69c6-47fc-b7f8-b7247fb613b4.png)

 
 Скриншот структуры базы данных:
 ![image](https://user-images.githubusercontent.com/75362472/147476232-0125865b-e2c1-4b22-b82f-e3254f2cf4d4.png)

4. getOperationList
Отображает список операций за выбранный период;
