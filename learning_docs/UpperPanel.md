# UpperPanel

## Purpose / Responsibility
The `UpperPanel` acts as the "Hero" or "Welcome" section of the Home screen. It provides the main brand messaging, a brief description of the restaurant, and a call-to-action button. It is styled to match the Little Lemon brand identity.

## Input Parameters
- None. This is a static component.

## How it works within the UI
It is placed between the `TopAppBar` and the `LowerPanel` on the `HomeScreen`. It uses a `Column` with a **Primary Green** background to make the section stand out.

## Simple Explanation
Think of this as the "Billboard" of the app.
- **Brand Colors**: It uses the signature green background with a **Yellow** title.
- **Content**: It shows the name "Little Lemon" and the location "Chicago", followed by a short description of the restaurant.
- **Visuals**: A decorative image of a dish is shown on the right, cropped to fit nicely.
- **Interaction**: Features an "Order Take Away" button styled in yellow with rounded corners.

This component demonstrates how to use `background` modifiers and custom colors to create a branded "Hero" section.
