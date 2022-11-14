echo "[2,5,7,9,8,-1], target = 15" 
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers": [
        2,
        5,
        7,
        9,
        8,
        -1
    ],
    "target": 15
}'

echo ""

echo "[-2,-5,-7,9,8,-1], target=7" 
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers": [
        -2,
        -5,
        -7,
        9,
        8,
        -1
    ],
    "target": 7
}'

echo ""

echo "[-2, -5, -7, -9, -8, -1], target = -3"
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers": [
        -2,
        -5,
        -7,
        -9,
        -8,
        -1
    ],
    "target": -3
}'

echo ""
echo "[1, 3, 3, 2, 5, 6, 3, 3, 4], target = 6 "
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers" : [1, 3, 3, 2, 5, 6, 3, 3, 4],
    "target" : 6
}'

echo ""
echo "[ 3, 3, 2, 5, 6, 3, 3], target = 6 / no solution since numbers are reqd to be distinct"
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers" : [ 3, 3, 2, 5, 6, 3, 3],
    "target" : 6
}'

echo ""
echo "[1, 3, 3, 2, 5, 6, 3, 3, 4], target = 100 no solution"
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers" : [1, 3, 3, 2, 5, 6, 3, 3, 4],
    "target" : 100
}'

echo ""
echo "[], target = 20 empty list"
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers" : [],
    "target" : 20
}'

echo ""
echo "[], target = 20 null list"
curl --location --request POST 'http://localhost:8080/api/target' \
--header 'Content-Type: application/json' \
--data-raw '{
    "numbers" : null,
    "target" : 20
}'

echo ""
