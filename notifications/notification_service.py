import firebase_admin
from firebase_admin import messaging, credentials

cred = credentials.Certificate("path/to/serviceAccountKey.json")
firebase_admin.initialize_app(cred)

def send_notification(token, message_title, message_body):
    message = messaging.Message(
        notification=messaging.Notification(
            title=message_title,
            body=message_body,
        ),
        token=token,
    )
    response = messaging.send(message)
    print('Successfully sent message:', response)

# Example usage
send_notification('<FCM Token>', 'Flight Status Update', 'Your flight AA123 is now delayed')
