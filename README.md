

# Food Delivery Platform API

This is an API for a food delivery platform that allows users to order food from restaurants.

## Technologies Used

- Java
- Spring Boot
- MySQL
- AWS (Amazon Web Services)

API Documentation
The API documentation is available using Swagger. After running the application, you can access the Swagger UI at http://localhost:8080/swagger-ui.html. It provides detailed information about each endpoint, request parameters, and response formats.

# Controllers
## UserController
POST /api/users - Create a new user.
GET /api/users/{userId} - Get information about a specific user.
GET /api/users/{userId}/orders - Get the order history for a user.
POST /api/users/{userId}/orders - Place a new order for a user.
## FoodItemController
POST /api/food-items - Add a new food item.
GET /api/food-items/{foodItemId} - Get information about a specific food item.
PUT /api/food-items/{foodItemId} - Update information for a food item.
DELETE /api/food-items/{foodItemId} - Delete a food item.
## OrderController
GET /api/orders/{orderId} - Get information about a specific order.
GET /api/orders - Get all orders.
PUT /api/orders/{orderId}/cancel - Cancel a specific order.
# Services
## UserService
The UserService handles user-related operations such as user creation, retrieval, and order management.

## FoodItemService
The FoodItemService handles food item-related operations such as adding new food items, updating information, and deleting food items.

## OrderService
The OrderService handles order-related operations such as placing new orders, retrieving order details, and canceling orders.

## Usage
To use the API, you need to authenticate as a user. Once authenticated, you can place orders, view order history, and perform CRUD operations on food items .

Refer to the API documentation for detailed information on the request and response formats for each endpoint.
.

## AWS Deployment

To deploy the API to AWS, follow these steps:

1. Set up an AWS account if you haven't already.
2. Install the AWS CLI on your local machine and configure it with your AWS credentials.
3. Build the project using the following command:

```
$ ./mvnw clean install
```

4. Create an S3 bucket to store the deployment artifacts.
5. Package the application for deployment:

```
$ ./mvnw package
```




## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.




## Contact

For any inquiries or support, please contact [hukumsingh9854@gmail.com].

Feel free to update the information and customize the instructions based on your specific project.
