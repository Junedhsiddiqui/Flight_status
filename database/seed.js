const MongoClient = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017';
const dbName = 'flightStatusDB';

MongoClient.connect(url, function(err, client) {
  if (err) throw err;
  const db = client.db(dbName);
  const flights = [
    { airline: 'Airline A', number: 'AA123', status: 'On Time' },
    { airline: 'Airline B', number: 'BB456', status: 'Delayed' },
  ];

  db.collection('flights').insertMany(flights, function(err, res) {
    if (err) throw err;
    console.log('Number of documents inserted: ' + res.insertedCount);
    client.close();
  });
});
