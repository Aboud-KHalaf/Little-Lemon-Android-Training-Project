# Little Lemon App - Learning Guide

Welcome to the Little Lemon Android project documentation! This guide is designed to help you understand how the app is built using **Jetpack Compose**.

## Project UI Structure

The app uses a single-activity architecture with **Compose Navigation**. The `MainActivity` sets up a `NavHost` that manages the transitions between different screens.

### Navigation Map
- **Home**: The starting screen showing the restaurant branding and menu.
- **Menu/DishDetails**: A screen showing details for a specific food item.

### Visual Hierarchy Diagram
Here is how the Composables are nested within each other:

```text
MainActivity (Navigation Host)
│
└── LittleLemonTheme (Theme Wrapper)
    │
    ├── HomeScreen (Screen)
    │   ├── TopAppBar (Header)
    │   ├── UpperPanel (Hero Section)
    │   └── LowerPanel (Menu Container)
    │       ├── WeeklySpecialCard (Highlight)
    │       └── MenuDish (Individual List Item)
    │
    └── DishDetails (Screen)
        └── Counter (Reusable Quantity Selector)
```

---

## Composables Index

We have categorized the components to help you understand their scale and usage.

### 🎨 Theme
- [LittleLemonTheme](LittleLemonTheme.md) - The global styling wrapper.

### 📱 Screens
These components represent a full "page" in the application.
- [HomeScreen](HomeScreen.md) - The main landing page.
- [DishDetails](DishDetails.md) - The detailed view for a single menu item.

### 🏗️ UI Components (Sections)
Large building blocks that make up a screen.
- [TopAppBar](TopAppBar.md) - The persistent top navigation bar.
- [UpperPanel](UpperPanel.md) - The "Hero" section with the title and description.
- [LowerPanel](LowerPanel.md) - The container for the menu list.

### 🧩 Reusable & Sub-Components
Smaller, focused components.
- [MenuDish](MenuDish.md) - A list item representing a food dish.
- [WeeklySpecialCard](WeeklySpecialCard.md) - A card for highlighting specials.
- [Counter](Counter.md) - A stateful plus/minus quantity selector.

---

## How to use this guide
If you are new to the project, start with the **HomeScreen**. It's the best place to see how multiple small components come together to form a functional UI. As you explore the code, refer back to these documents to understand the *purpose* behind each Composable function.
