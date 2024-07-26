from flask import Flask

def create_app():
    app = Flask(__name__)
    app.config.from_object('app.config.Config')

    with app.app_context():
        # Importa las rutas para que estén registradas
        from . import routes

    return app
