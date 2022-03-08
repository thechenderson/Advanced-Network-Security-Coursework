d3.json("./files/products.json").then((data) => {
    var products = d3.select(".products")
        .selectAll("div")
        .data(data)
        .enter()
        .append("div")
        .attr("class", "col")
        .append("div")
        .attr("class", "card mb-2")
        .style("width", "18rem")
        .append("a")
        .attr("href", "#")
        .append("div")
        .attr("class", "card-body")

    products.append("h5")
        .attr("class", "card-title")
        .text(function (d){
            return d.name
        })
    products.append("span")
        .attr("class", "card-text")
        .text(function (d){
            return "£"+d.price
        })
    products.append("div")
        .attr("class", "card-text")
        .text(function (d){
            return d.description
        })
    products.append("img")
        .attr("href", function (d){
            return d.image;
        })
})
