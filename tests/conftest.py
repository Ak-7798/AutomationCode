# conftest.py
# This file contains shared fixtures that can be used across multiple test files

import pytest

@pytest.fixture(scope="session")
def global_test_data():
    """
    A session-scoped fixture that provides test data available for all test files
    
    This fixture runs once for the entire test session and can be used to set up
    data or resources that are needed by multiple test files.
    
    Returns:
        dict: A dictionary containing test data
    """
    return {
        "test_name": "Calculator Tests",
        "version": "1.0.0",
        "author": "Pytest Framework Demo"
    }

@pytest.fixture(autouse=True)
def run_around_tests():
    """
    An auto-use fixture that runs before and after each test
    
    This fixture demonstrates the setup and teardown pattern.
    It will automatically run around every test without needing to be explicitly requested.
    """
    # Setup - runs before each test
    print("\n-----------------")
    print("Setting up test...")
    
    # This is where the test runs
    yield
    
    # Teardown - runs after each test
    print("Cleaning up...")
    print("-----------------")
