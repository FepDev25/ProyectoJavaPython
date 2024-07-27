from flask import current_app as app, jsonify, request
from .utils import generate_random_number

@app.route('/api/data', methods=['GET'])
def get_data():
    # Ejemplo de respuesta JSON
    data = {"message": "Hello from Flask!"}
    return jsonify(data)

@app.route('/api/data', methods=['POST'])
def post_data():
    data = request.json
    # Procesar los datos recibidos
    return jsonify({"received": data}), 201

@app.route('/api/random', methods=['GET'])
def get_random_number():
    random_number = generate_random_number()
    return jsonify({"random_number": str(random_number)})


print("")