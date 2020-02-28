# Virgin Holidays ~ Flight Information Display
## Phase 1
1) The project is done by Spring Boot with Rest Api. In Phase 1, the Model and conroller for Flight data have been created. 
And also the service for business logic, in this case fetch the departures for the given day.
1) Intstead of CSV file to load Flight Data, the code accept the JSON to load the Flight Data by POST method and its non-presistent.
1) To retrive the result the GET method pass the DAY and get all the Flight departure on the given DAY.
1) There is no View/UI is created, the POST and GET methods are tested using Postman app.

## Phase 2
1) The Flight data CSV should be loaded using @PostConstruct, which call after default constructor of Service Bean
