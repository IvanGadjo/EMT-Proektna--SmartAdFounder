# SmartAdFounder
The backend application of a chrome extension used for scheduling and finding desired adverts.
Pazar3.mk and reklama5.mk are one of the biggest ad listing websites in North Macedonia. Therefore, the core idea is to have a chrome extension that simplifies and automates finding ads on pazar3.mk and reklama5.mk. The user can set keywords, other criteria and a time limit, by which the search will be conducted. When a matching ad is found, a notification alarms the user. He/She is also able to see all of the collected ads for the current search criterias, but also past searches with the respective found ads.

Technologies
------
This project is built with Java Spring. It is following the DDD (Domain Driven Design) principles for the most extent (aplication & domain logic, value objects, factory class...).
- Services: CRUD services for model classes, rest services for scheduling reklama5 and pazar3 requests
- Other tools: Apache Kafka for message scheduling, WebSocket for connection with the frontend
- Database: PostgreSQL

Front end code:
https://github.com/andrejhris23/SmartAdFounder-FrontEnd
