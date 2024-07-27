import random

def generate_random_number(min_value=1, max_value=100):
    """Genera un número aleatorio entre min_value y max_value."""
    return random.randint(min_value, max_value)
