# Configuration

- Install `Docker Desktop` - https://www.docker.com/products/docker-desktop
- Go to directory `db` - Run the command `docker-compose up`
- Wait a few seconds, open URL `http://localhost:10000/`
- Login with credentials: 
    - Username: `admin@gmail.com`
    - Password: `password`
- Click on `Add New Server`
- Fill
    - Name: anything
    - Host: `posgresql_db`
    - Port: `5432`
    - Username: `metanet_admin`
    - Password: `password`
    - Database or Maintainance Database: `metanet`

# In IntelliJ
- Same as above except:
    - Host: `localhost`
    - Port: `10001`
