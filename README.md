Order & Inventory for a B2B (warehouse)
- ability to track and see the orders of each businesses
- ability to add an item for order
- ability to update an item for order
- ability to create profile of company that will order
- ability to list the orders of each company
- ability to send an invoice document to the company once the order has been created

Models:
1. StockInventory
    - name
    - description
    - quantity
    - createdAt
    - updatedAt
    - category
    - lastEditedBy
    - id
    - 
2. Category
    - id
    - name
3. User
    - firstName
    - lastName
    - middleName
    - companyId
    - email
    - id
4. Company
    - id
    - name
    - address
    - createAt
    - updatedAt
5. Order
    - StockInventoryId
    - companyId
    - amountDue
    - totalQuantity
    - datetime
    - status
6. ORDERSTATUS
    - draft
    - pending
    - approved
    - ontransit
    - delivered
7. 