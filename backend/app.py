from flask import Flask, jsonify

app = Flask(__name__)

# Mock data
flights = [
    {"id": 1, "airline": "Airline A", "number": "AA123", "status": "On Time"},
    {"id": 2, "airline": "Airline B", "number": "BB456", "status": "Delayed"},
]

@app.route('/api/flights', methods=['GET'])
def get_flights():
    return jsonify(flights)

@app.route('/api/fetch_airport_data', methods=['GET'])
def fetch_airport_data():
    # Fetch data from mock airport database
    mock_data = [
        {"id": 1, "airline": "Airline A", "number": "AA123", "status": "On Time"},
        {"id": 2, "airline": "Airline B", "number": "BB456", "status": "Delayed"},
    ]
    return jsonify(mock_data)

if __name__ == '__main__':
    app.run(debug=True)
