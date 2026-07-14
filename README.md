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
   - id
   - referenceId
   - companyId
   - items (OrderItem)
   - orderdate
   - createdate
   - lastmodified
   - status
6. OrderItem
   - id
   - referenceid FK(reference_id)
   - itemid
   - quantity
7. ORDERSTATUS
   - draft
   - pending
   - approved
   - ontransit
   - delivered
