# DishDetails

## Purpose / Responsibility
The `DishDetails` screen is responsible for showing detailed information about a specific food item selected from the menu. It allows users to see the full description and potentially select a quantity.

## Input Parameters
- `id: Int`: The unique identifier of the dish to display. This ID is used to fetch the full dish details from the `DishRepository`.

## How it works within the UI
When a user clicks on a dish in the `LowerPanel`, the app navigates to this screen. It retrieves the data for the specific `id` and displays it. 

*Note: In the current starter code, the UI for this screen is under construction (marked with a TODO).*

## Simple Explanation
Imagine you clicked on "Greek Salad" on the menu. This screen is the "Full Page" for that salad. It’s where you’d read about the ingredients and decide how many you want to order.
