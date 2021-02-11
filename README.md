# SmartAdFounder
The backend application of a chrome extension used for scheduling and finding desired adverts.
Pazar3.mk and reklama5.mk are one of the biggest ad listing websites in North Macedonia. Therefore, the core idea is to have a chrome extension that simplifies and automates finding ads on pazar3.mk and reklama5.mk. The user can set keywords, other criteria and a time limit, by which the search will be conducted. When a matching ad is found, it is listed so the user can preview the link. He/She is also able to see all of the collected ads for the current search criterias, but also past searches with the respective found ads.

Technologies
------
This project is built with Java Spring. It is following the DDD (Domain Driven Design) principles for the most extent (aplication & domain logic, value objects, factory class...).
- Services: CRUD services for model classes, rest services for scheduling reklama5 and pazar3 requests
- Other tools: 
  - Apache Kafka for message scheduling (found advert messages). Implemented by a timed task, which sends the found adverts to Kafka.
  - WebSocket for a reliable connection with the frontend. Every message stored in the Apache Kafka server is then sent through the WebSocket to the frontend.
  - Jsoup maven dependency for parsing the resulting HTML from reklama5 and pazar3 in order to extract the found adverts.
  - Implementation of a rest service scheduler, which executes regular HTTP requests to reklama5 and pazar3, as required from the respective user interests.
- Database: PostgreSQL

Front end code:
https://github.com/andrejhris23/SmartAdFounder-FrontEnd
