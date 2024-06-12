# STonic Conference

## Introduction

This is a simple imaginary annual conference to present Functional Programming in Scala 3.
The intention is to use scala ecosystem offerings to cover all the aspects of a production ready application.

## Technologies

1. - [ ] **Programming languages**
   1. - [ ] Scala 3
2. - [ ] **Build Tool**
   1. - [ ] SBT
3. - [ ] ZIO core: ZIOApp, ZLayer, Error Management, Fiber, Resource Management
   - ZIO Direct Style
   - ZIO Config
   - ZIO Console
   - ZIO Logging (slf4j)
   - ZIO HTTP
   - ZIO JSON
   - ZIO Persistence Quill (Postgres)
   - ZIO Kafka (Streaming)
   - (NTH) ZIO Persistence (Cassandra)
13. - [ ] **Testing**
    1. ZIO Test
    2. (NTH) ZIO Test Containers
14. - [ ] ZIO Schedule
15. - [ ] Web Application
    1. ScalaJS
    2. Laminar
16. - [ ] Notifications
    1. - [ ] Java Mail
17. - [ ] **Observability**
    1. - [ ] Metrics
    2. - [ ] Tracing
    3. - [ ] Monitoring

### Architecture

1. - [ ] Microservices
2. - [ ] Event Driven
3. - [ ] Onion + Hexagonal Architecture

## Resiliency

1. - [ ] Retries
2. - [ ] Circuit Breaker
3. - [ ] Saga Pattern
4. - [ ] Back Pressure
5. - [ ] (NTH) Service Discovery
6. - [ ] (NTH) Client Load Balancing

## Security

1. - [ ] HTTPs (Web API - endpoints)
2. - [ ] HTTPs (HTTP Client)
3. - [ ] JWT for Authentication (Auth0 JWT)

### Deployment

1. - [ ] Docker
2. - [ ] Kubernetes (local minikube)
3. - [ ] (NTH) Microsoft Azure

## The structure of the data model

- TicketType: Free, Paid[price]
- SponsorshipType: Platinum, Gold, Silver
- ConferenceType (Technical: [technology], Environmental: [aspect, zone], Medical: [specialization, disease])
- Address (Street, City, State, Zip, Country)
- Contact (Name, Email, Phone)
- Organization (Name, Address, Contact)
- Venue (Name, Address, Capacity)
- Schedule (talks)
- Speaker (name, organization, contact)
- Talk (title, optional[description], speakers, duration, schedule)
- Workshop (title, optional[description], speakers, duration)
- Attendee (name, optional[contact], ticketType)
- Sponsor (name, sponsorshipType)
- Conference (name, conferenceType, venue, contact, attendees, speakers, talks, workshops, sponsors)## Features

## Model

1. - [ ] Venue

  ```scala
  case class Venue(name: String, address: String, capacity: Int)
  ```

2. - [ ] Schedule

  ```scala
  case class Schedule(date: LocalDate, time: LocalTime, title: String, speaker: Speaker)
  ```

### Business Logic

1. - [ ] **Talks Management**
2. - [ ] **Workshops Management**
3. - [ ] **Attenders Management**
4. - [ ] **Sponsors Management**
5. - [ ] **Venue Service**
6. - [ ] **Schedule Service**
7. - [ ] **Speaker Service**


## References

1. [ZIO](https://zio.dev)
