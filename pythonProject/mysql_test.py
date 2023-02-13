import mysql.connector

config ={
        "host": "localhost",
        "user": "root",
        "password": "Tzboy944*",
        "database": "movies"
}
try:
    dp = mysql.connector.connect(**config)
    print("\n Database user{} connected to MySQL on host {} with database {} " .format(config["user"],config["host"],config["database"]))
    input("\n\n Press any key to continue...")
except mysql.connector.Error as error:
    if error.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("The supplied user name or password are invalid")
    elif error.errno == errorcode.ER_BAD_DB_ERROR:
        print("The specific database does not exist")
    else:
        print(error)
finally:
    dp.close()
