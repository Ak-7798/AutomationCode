# calculator.py
# This module contains basic calculator functions that we'll test using pytest

def add(a: float, b: float) -> float:
    """
    Add two numbers and return the result
    
    Args:
        a (float): First number
        b (float): Second number
    
    Returns:
        float: Sum of a and b
    """
    return a + b

def subtract(a: float, b: float) -> float:
    """
    Subtract second number from first number
    
    Args:
        a (float): Number to subtract from
        b (float): Number to subtract
    
    Returns:
        float: Result of a - b
    """
    return a - b

def multiply(a: float, b: float) -> float:
    """
    Multiply two numbers
    
    Args:
        a (float): First number
        b (float): Second number
    
    Returns:
        float: Product of a and b
    """
    return a * b

def divide(a: float, b: float) -> float:
    """
    Divide first number by second number
    
    Args:
        a (float): Numerator
        b (float): Denominator
    
    Returns:
        float: Result of a / b
        
    Raises:
        ValueError: If b is zero
    """
    if b == 0:
        raise ValueError("Cannot divide by zero!")
    return a / b
