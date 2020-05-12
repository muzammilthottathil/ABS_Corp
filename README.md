> Java AWT project to manage employees at a company named ABS Corp
# Running the Project

Download and unzip the repository by cloning or downloading the repo

Then import the project as zip to java netbeans IDE. 
> project zip folder name is ABScorp

Then add MySQL jar file in the Library folder inside ABScorp project folder in NetBeans IDE.

> MySQL jar file is inside Dependencies in the downloaded repo => mysql-connector-java-8.0.20.jar

Then change the database password at Connection line in db.java file
> Replacing "Password@123" to "YOUR PASSWORD"

# MySQL Database
> Create a new schema and name it as ABS_Corp

With the culomn requirement as follows
```
	empID   	int(11)		UNIQUE
	username	varchar(45) 	PRIMARY KEY	
	Password	varchar(45)
	Salary		varchar(45)
	pos		varchar(45)
	firstName	varchar(45)
	lastName	varchar(45)
	age		int(11)
	gender		varchar(45)
	dob		varchar(15)
	email		varchar(50)
	contact		varchar(15)
	status		varchar(45)
	supervisor	varchar(45)
```
