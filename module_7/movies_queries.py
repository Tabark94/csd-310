import mysql.connector
from mysql.connector import errorcode

config = {
    "host": "localhost",
    "user": "root",
    "password": "Tzboy944*",
    "database": "movies"
}

try:
    dp = mysql.connector.connect(**config)
    print("\n Database user{} connected to MySQL on host {} with database {} ".format(config["user"], config["host"],
                                                                                      config["database"]))

    cursor = dp.cursor()

    # First query: Select all fields from studio table
    cursor.execute("SELECT * FROM studio")
    studios = cursor.fetchall()
    print("\nStudios:")
    for studio in studios:
        print(studio)

    # Second query: Select all fields from genre table
    cursor.execute("SELECT * FROM genre")
    genres = cursor.fetchall()
    print("\nGenres:")
    for genre in genres:
        print(genre)

    # Third query: Select movie names with runtime less than two hours
    cursor.execute("SELECT name FROM movie WHERE runtime < 120")
    movies = cursor.fetchall()
    print("\nMovies with runtime less than two hours:")
    for movie in movies:
        print(movie[0])

    # Fourth query: Select film names and directors ordered by director
    cursor.execute("SELECT name, director FROM movie ORDER BY director")
    films = cursor.fetchall()
    print("\nFilms ordered by director:")
    for film in films:
        print("{} by {}".format(film[0], film[1]))

except mysql.connector.Error as error:
    if error.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("The supplied user name or password are invalid")
    elif error.errno == errorcode.ER_BAD_DB_ERROR:
        print("The specific database does not exist")
    else:
        print(error)
finally:
    dp.close()
