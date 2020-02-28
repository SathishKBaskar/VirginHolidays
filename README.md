# Virgin Holidays ~ Flight Information Display
## Phase 1
1) The project is done by Spring Boot with Rest Api. In Phase 1, the Model and conroller for Flight data have been created. 
And also the service for business logic, in this case fetch the departures for the given day.
1) Intstead of CSV file to load Flight Data, the code accept the JSON to load the Flight Data by POST method and its non-presistent.
1) To retrive the result the GET method pass the DAY and get all the Flight departure on the given DAY.
1) There is no View/UI is created, the POST and GET methods are tested using Postman app.

##### JSON to load the Flight Data
The [flight data](FlightData.json) is a JSON model for the given csv file.

##### Test Phase 1 using Postman app.
1) After starting the application in the local IDE as mentioned in the [Depoly and Run](#deploy-and-run).
1) Load the [flight data](FlightData.json), using the POST request localhost:8080/api/departure/
1) Retreive the flight data for the day by using the Day in the GET request localhost:8080/api/departure/WED

## Phase 2 - tbd
1) The Flight data CSV can be loaded using @PostConstruct, which will be called after default constructor of Service Bean
1) ResourceLoader of org.springframework.core.io.ResourceLoader package, can be used to read the csv from the resources folder.
1) While loading map the CSV data by transforming to above JSON formatted Model.
1) The input to find the day from the given date and year, rather giving the day directly to fetch the flight departure details.
1) Completing the UNIT test.

## Phase 3 - tbd
1) Creating the UI, where user can select the date from Calendar to fetch the Flight departure details.

## Depoly and Run
1) Download the folder "departure" to your local folder.
1) In IDE (I have used IntelliJ) create a project by selecting the file pom.xml inside the departure folder.
1) The SDK should be Java 8 and above, and make sure the project built without any issue after downloading the dependency.
1) Open the com.virgin.holidays.departure.DepartureApplication.java and RUN the DepartureApplication.
1) In the console verify the Application started without any issues. 
    Started DepartureApplication in 2.17 seconds (JVM running for 2.619)
1) 
