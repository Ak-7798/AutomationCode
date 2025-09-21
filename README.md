# Python Testing Framework with Pytest

This repository contains a comprehensive testing framework built with pytest, demonstrating best practices for Python testing.

## Framework Structure

```
PythonFramework/
│
├── calculator.py            # Sample module with calculator functions
│
├── tests/
│   ├── __init__.py
│   ├── test_calculator.py  # Test cases for calculator module
│   └── conftest.py        # Shared pytest fixtures and configurations
│
├── reports/
│   ├── report.html        # HTML test execution report
│   ├── coverage/          # Code coverage reports
│   └── allure-results/    # Allure test reports
│
└── pytest.ini             # Pytest configuration file
```

## Features

- **Modular Test Structure**: Well-organized test files with clear separation of concerns
- **Fixtures**: Reusable test fixtures in conftest.py
- **Multiple Report Formats**:
  - HTML Reports
  - Coverage Reports
  - Allure Interactive Reports
- **Detailed Documentation**: Well-documented test cases with clear descriptions
- **Test Categories**: Tests organized by features and functionality

## Setup

1. **Python Environment Setup**
   ```bash
   python -m venv venv
   source venv/bin/activate  # On Windows: venv\Scripts\activate
   ```

2. **Install Dependencies**
   ```bash
   pip install pytest pytest-html pytest-cov allure-pytest
   ```

3. **Install Allure** (Optional, for enhanced reporting)
   ```bash
   # Windows (using Scoop)
   scoop install allure
   ```

## Running Tests

### Basic Test Execution
```bash
python -m pytest
```

### Run with Different Report Options

1. **HTML Report**
   ```bash
   python -m pytest --html=reports/report.html
   ```

2. **Coverage Report**
   ```bash
   python -m pytest --cov=. --cov-report=html:reports/coverage
   ```

3. **Allure Report**
   ```bash
   python -m pytest --alluredir=reports/allure-results
   allure serve reports/allure-results
   ```

### Running Specific Tests

- Run a specific test file:
  ```bash
  python -m pytest tests/test_calculator.py
  ```

- Run a specific test function:
  ```bash
  python -m pytest tests/test_calculator.py::test_add
  ```

- Run tests matching a keyword:
  ```bash
  python -m pytest -k "add or subtract"
  ```

## Test Report Locations

- HTML Report: `reports/report.html`
- Coverage Report: `reports/coverage/index.html`
- Allure Report: `reports/allure-results` (Use `allure serve` to view)

## Framework Components

### 1. calculator.py
- Contains basic calculator functions
- Includes type hints and docstrings
- Implements error handling

### 2. test_calculator.py
- Contains test cases for calculator functions
- Uses pytest fixtures
- Includes various assertion types
- Features Allure decorators for enhanced reporting

### 3. conftest.py
- Defines shared fixtures
- Contains session-level configurations
- Implements test setup and teardown patterns

### 4. pytest.ini
- Configures test discovery
- Sets output formatting
- Configures reporting options
- Defines warning filters

## Best Practices Demonstrated

1. **Test Organization**
   - Clear test file structure
   - Logical test grouping
   - Descriptive test names

2. **Code Quality**
   - Type hints
   - Comprehensive docstrings
   - Clear error handling

3. **Testing Patterns**
   - Fixture usage
   - Parameterized testing
   - Exception testing

4. **Reporting**
   - Multiple report formats
   - Detailed test documentation
   - Coverage tracking

## Contributing

1. Create a new branch for your feature
2. Write tests for new functionality
3. Ensure all tests pass
4. Submit a pull request

## License

