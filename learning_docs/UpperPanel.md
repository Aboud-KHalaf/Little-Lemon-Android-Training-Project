# UpperPanel

## Purpose / Responsibility
The `UpperPanel` acts as the "Hero" or "Welcome" section of the Home screen. It provides the main brand messaging, a brief description of the restaurant, and a call-to-action button.

## Input Parameters
- None. This is a static component for now.

## How it works within the UI
It is placed between the `TopAppBar` and the `LowerPanel` on the `HomeScreen`. It uses a mix of `Column` and `Row` layouts to organize text and imagery.

## Simple Explanation
Think of this as the "Billboard" of the app.
- It shows the name "Little Lemon" and the location "Chicago" in large, bold text.
- It displays a descriptive paragraph alongside a decorative image of a dish.
- It features a "Reserve a Table" button to encourage user interaction.

This component uses `stringResource` for all its text, which is a best practice for supporting multiple languages (internationalization).
