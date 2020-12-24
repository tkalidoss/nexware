# angular-spring-boot-palindrome-demo

Simple Palindrome Check Using Angular + Spring Boot + JPA + MySQL

1. Schema First Application (First Create DB And Run SCRIPT WHICH IS LOCATED IN RESOURCES FOLDER (db.sql))
2. To Run Backend ( go to root folder -> write the command [Clean is Optional You can either use ./gradlew clean bootRun or ./gradlew bootRun]




# Rest endpoints

GET - /getAll - Get All palindromes [returns all the palindrome list in database]

POST - /save - save Palindrome (Payload { PalindromeReqDto }  which is Json Object from UI for Palindrome Entity.) 
[save and return saved palindrome data as response ]




