# JUnit Testing Guide

## Overview
This project now includes comprehensive JUnit 5 testing with Mockito for mocking dependencies.

## Project Structure
```
SE305-Project/
├── src/                    # Source code
│   ├── Business/
│   ├── Data/
│   └── Presentation/
├── test/                   # Test code
│   ├── Business/
│   │   └── OrderServiceTest.java
│   ├── Data/
│   │   └── OrderRepositoryTest.java
│   └── Presentation/
│       └── OrderViewTest.java
└── pom.xml                # Maven configuration
```

## Test Coverage

### OrderRepositoryTest (Data Layer)
- ✅ Test saving single and multiple orders
- ✅ Test retrieving all orders
- ✅ Test order count functionality
- ✅ Test immutability of returned lists
- ✅ Test initial empty state

### OrderServiceTest (Business Layer)
- ✅ Test successful order processing
- ✅ Test validation failures (zero, negative amounts)
- ✅ Test null/empty payment method validation
- ✅ Test different payment methods
- ✅ Test edge cases (small/large amounts)
- ✅ Test order information format
- ✅ Uses Mockito to mock OrderRepository

### OrderViewTest (Presentation Layer)
- ✅ Test order capture with all payment methods
- ✅ Test invalid input handling
- ✅ Test error message display
- ✅ Test success message display
- ✅ Test welcome message
- ✅ Uses Mockito to mock OrderService

## Running Tests

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Install Maven (if not installed)
Download from: https://maven.apache.org/download.cgi

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=OrderRepositoryTest
mvn test -Dtest=OrderServiceTest
mvn test -Dtest=OrderViewTest
```

### Run Tests with Detailed Output
```bash
mvn test -X
```

### Generate Test Report
```bash
mvn surefire-report:report
```
The report will be generated in `target/surefire-reports/`

## Dependencies
- **JUnit 5 (Jupiter)** - Testing framework
- **Mockito** - Mocking framework for unit tests

## Test Annotations Used
- `@Test` - Marks a method as a test method
- `@BeforeEach` - Runs before each test method
- `@AfterEach` - Runs after each test method
- `@DisplayName` - Provides custom display name for tests

## Mockito Usage
Mockito is used to create mock objects and verify interactions:
```java
// Create mock
OrderRepository mockRepository = mock(OrderRepository.class);

// Verify method was called
verify(mockRepository, times(1)).saveOrder(anyString());

// Stub return value
when(mockOrderService.processOrder(100.0, "Credit Card")).thenReturn(true);
```

## Building the Project
```bash
# Compile source code
mvn compile

# Compile tests
mvn test-compile

# Run tests
mvn test

# Package as JAR
mvn package
```

## Running the Application
```bash
# After packaging
java -jar target/SE305-Project-1.0.0.jar

# Or directly
mvn exec:java -Dexec.mainClass="Presentation.OrderView"
```

## Continuous Integration
The test suite is designed to be CI/CD friendly and can be integrated with:
- GitHub Actions
- Jenkins
- GitLab CI
- Travis CI

## Best Practices Implemented
1. **Isolation** - Each test is independent
2. **Mocking** - External dependencies are mocked
3. **Clear naming** - Descriptive test names using @DisplayName
4. **Setup/Teardown** - Proper initialization and cleanup
5. **Assertions** - Clear and specific assertions
6. **Coverage** - Tests cover success, failure, and edge cases
