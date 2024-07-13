# Extensive API Documentation
# Link to API Documentation - https://prebor97.github.io/anotherSwaggerDoc/#/
# Link to Database schema design - https://drive.google.com/file/d/1JiM6S7zAKvXSGkTD7cxMktayfbrSMr3V/view?usp=sharing
This documentation provides a high-level overview of the APIs for managing users, handling requests, and other features such as blogs, languages, and regions.

## Table of Contents

- [API Endpoints](#api-endpoints)
  - [Authentication](#authentication)
  - [Messaging](#messaging)
  - [Payments](#payments)
  - [User Management](#user-management)
  - [Organization Management](#organization-management)
  - [Blog Management](#blog-management)
  - [Language Management](#language-management)
  - [Region Management](#region-management)
- [DTOs](#dtos)
- [Models](#models)

## API Endpoints

### Authentication

- **Login**: Allows a user to log in using their email and password.
- **Magic Link Authentication**: Sends a magic link to the user's email for authentication.
- **Change Password**: Enables a user to change their password.

### Messaging

- **Send Email**: Sends an email to a specified recipient with a subject and body.

### Payments

- **Stripe Payment**: Processes a payment using Stripe.
- **Flutterwave Payment**: Processes a payment using Flutterwave.

### User Management

- **Get All Users**: Retrieves a list of all users.
- **Create User**: Creates a new user.
- **Get User by ID**: Retrieves a specific user by their ID.
- **Update User**: Updates the details of an existing user.
- **Delete User**: Deletes a specific user by their ID.

### Organization Management

- **Get All Organizations**: Retrieves a list of all organizations.
- **Create Organization**: Creates a new organization.

### Blog Management

- **Get All Blog Posts**: Retrieves a list of all blog posts.
- **Create Blog Post**: Creates a new blog post.
- **Get Blog Post by ID**: Retrieves a specific blog post by its ID.
- **Update Blog Post**: Updates an existing blog post.
- **Delete Blog Post**: Deletes a specific blog post by its ID.
- **Get All Blog Posts by User**: Retrieves all blog posts created by a specific user.

### Language Management

- **Get All Languages**: Retrieves a list of all languages.
- **Create Language**: Creates a new language.

### Region Management

- **Get All Regions**: Retrieves a list of all regions.
- **Create Region**: Creates a new region.

## DTOs

### LoginRequest
Represents the data required for a user to log in.

### AuthResponse
Represents the response after a successful authentication, including the token and status.

### ErrorResponse
Represents the error response containing a message, status, and error code.

### MagicLinkRequest
Represents the data required to send a magic link to a user's email.

### ChangePasswordRequest
Represents the data required for a user to change their password.

### EmailRequest
Represents the data required to send an email, including recipient, subject, and body.

### StripePaymentRequest
Represents the data required to process a payment using Stripe.

### FlutterwavePaymentRequest
Represents the data required to process a payment using Flutterwave.

### User
Represents a user with properties such as id, name, email, and password.

### UserUpdateRequest
Represents the data required to update a user's details, such as name and email.

### Organization
Represents an organization with properties such as id, name, and description.

### Blog
Represents a blog post with properties such as id, title, content, and associated user.

### Language
Represents a language with properties such as id and name.

### Region
Represents a region with properties such as id and name.

## Models

### USER
Represents a user entity with attributes such as id, name, email, password, and other personal details.

### NOTIFICATIONS
Represents notifications associated with users, including id, message, recipient, and status.

### INVITE
Represents invitations sent to users or prospective users, with details like id, email, and status.

### ADDRESS
Represents an address associated with a user or organization, including id, street, city, state, and postal code.

### PROFILE
Represents the profile information of a user, including id, bio, social media links, and other personal information.

### AUTHENTICATION
Represents authentication details such as login credentials and tokens for users.

### GDBRCONSENT
Represents the GDPR consent status of a user, including id, consent status, and date of consent.

### SETTINGS
Represents the settings associated with a user or organization, such as id, preferences, and configurations.

### LANGUAGES
Represents the languages available or preferred by users, including id and language name.

### REGION
Represents the regions or geographical areas associated with users or organizations, including id and region name.

### PAYMENT
Represents payment details associated with transactions, including id, amount, method, and status.

### BLOG
Represents blog posts created by users, including id, title, content, author, and date of creation.

### EMAIL TEMPLATE FOR ADMIN
Represents email templates used by administrators to send standardized emails, including id, subject, body, and template name.

### ORGANIZATION
Represents organizations with attributes such as id, name, description, and associated users.

### ACTIVITY LOG
Represents logs of activities performed by users or within the system, including id, action, user, and timestamp.

### WAITLIST
Represents users or entities on a waitlist for specific features or access, including id, email, and status.

### MESSAGING
Represents messaging details for sending messages between users or to users, including id, sender, recipient, message, and timestamp.

### ROLE
Represents roles assigned to users within the system, including id, role name, and associated permissions.
Represents a language with properties such as id and name.

### Region
Represents a region with properties such as id and name.
