from flask import Flask

def create_app():
    app = Flask(__name__)
    app.config.from_object('app.config.Config')

    # Importa las rutas aquí para evitar problemas de importación circular
    with app.app_context():
        from . import routes

    return app
