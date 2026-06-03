# Counter

## Purpose / Responsibility
The `Counter` Composable is a reusable stateful component that allows users to increment or decrement a numerical value. In this project, it's intended to be used for selecting the quantity of a dish.

## Input Parameters
- None. (Currently, it manages its own internal state).

## How it works within the UI
It displays a minus button, the current count, and a plus button in a horizontal row.
- It uses `remember` and `mutableStateOf` to keep track of the `counter` value.
- When the buttons are clicked, the state is updated, and Compose automatically "re-composes" (redraws) the text to show the new number.

## Simple Explanation
Think of this as a simple "Plus/Minus" selector. 
- Click `-` to decrease the number.
- Click `+` to increase the number.
It's like the quantity selector you see when shopping online. It demonstrates a fundamental concept in Jetpack Compose: **State**.
