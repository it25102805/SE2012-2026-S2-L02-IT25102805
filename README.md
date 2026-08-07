Project Structure

StudentManagement/
├── mainapp/
│   └── Main.java              
├── models/
│   ├── Student.java           
│   └── Course.java            
├── services/
│   └── EnrollmentManager.java
└── docs/    


To Compile -

javac mainapp/*.java models/*.java services/*.java 



To Run -

java mainapp.Main



To Generate JavaDoc -

javadoc -d docs mainapp/*.java models/*.java services/*.java