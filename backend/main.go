package main

import (
    "github.com/gin-gonic/gin"
    "net/http"
)

type Flight struct {
    ID      int    `json:"id"`
    Airline string `json:"airline"`
    Number  string `json:"number"`
    Status  string `json:"status"`
}

func main() {
    r := gin.Default()

    r.GET("/api/flights", func(c *gin.Context) {
        flights := []Flight{
            {ID: 1, Airline: "Airline A", Number: "AA123", Status: "On Time"},
            {ID: 2, Airline: "Airline B", Number: "BB456", Status: "Delayed"},
        }
        c.JSON(http.StatusOK, flights)
    })

    r.GET("/api/fetch_airport_data", func(c *gin.Context) {
        mockData := []Flight{
            {ID: 1, Airline: "Airline A", Number: "AA123", Status: "On Time"},
            {ID: 2, Airline: "Airline B", Number: "BB456", Status: "Delayed"},
        }
        c.JSON(http.StatusOK, mockData)
    })

    r.Run()
}
