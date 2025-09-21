# test_calculator.py
# This file contains test cases for the calculator module

import pytest
import allure
from calculator import add, subtract, multiply, divide

# Fixtures can be defined here or in conftest.py for shared fixtures
@pytest.fixture
def sample_numbers():
    """
    Fixture that provides a tuple of numbers for testing
    
    Returns:
        tuple: A tuple containing two numbers (10, 5)
    """
    return (10, 5)

def test_add(sample_numbers):
    """
    Test the add function with various scenarios
    """
    # Test with fixture values
    a, b = sample_numbers
    assert add(a, b) == 15, f"Expected {a} + {b} = 15"
    
    # Test with zero
    assert add(0, 5) == 5, "Adding zero should return the same number"
    
    # Test with negative numbers
    assert add(-1, 1) == 0, "Adding opposites should equal zero"

def test_subtract(sample_numbers):
    """
    Test the subtract function with various scenarios
    """
    # Test with fixture values
    a, b = sample_numbers
    assert subtract(a, b) == 5, f"Expected {a} - {b} = 5"
    
    # Test with same numbers
    assert subtract(5, 5) == 0, "Subtracting same numbers should be zero"
    
    # Test with negative result
    assert subtract(1, 5) == -4, "Subtracting larger from smaller should be negative"

def test_multiply(sample_numbers):
    """
    Test the multiply function with various scenarios
    """
    # Test with fixture values
    a, b = sample_numbers
    assert multiply(a, b) == 50, f"Expected {a} * {b} = 50"
    
    # Test with zero
    assert multiply(5, 0) == 0, "Multiplying by zero should be zero"
    
    # Test with negative numbers
    assert multiply(-2, 3) == -6, "Multiplying positive and negative should be negative"

def test_divide():
    """
    Test the divide function with various scenarios
    """
    # Test normal division
    assert divide(10, 2) == 5, "Expected 10 / 2 = 5"
    
    # Test division by 1
    assert divide(5, 1) == 5, "Division by 1 should return same number"
    
    # Test division that results in decimal
    assert divide(5, 2) == 2.5, "Expected 5 / 2 = 2.5"

def test_divide_by_zero():
    """
    Test that division by zero raises ValueError
    """
    with pytest.raises(ValueError) as excinfo:
        divide(10, 0)
    assert str(excinfo.value) == "Cannot divide by zero!"
