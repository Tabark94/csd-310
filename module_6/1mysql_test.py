import mysql.connector
from mysql.connector import errorcode

config = {
    'host': 'host_name',
    'user': 'user_name',
    'password': 'password',
    'database': 'database_name',
}

try:
    db = mysql.connector.connect(**config)
    print("Database user {} connected to Mysql on host {} with database {}".format(config['user'], config['host'], config['database']))
    input("\n\nPress any key to continue")
except mysql.connector.Error as err:
    if err.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("The supplied user name and password are invalid")
    elif err.errno == errorcode.ER_BAD_DB_ERROR:
        print("The specified database does not exist")
    else:
        print(err)
finally:
    if db.is_connected():
        db.close()
