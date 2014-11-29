package com.example.cs188project3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.example.cs188project3.Recipe;

public class XMLProcessor {
	
	private static List<Recipe> recipeList = new ArrayList<Recipe>();
	
	public static List<Recipe> getRecipeList() {
		return recipeList;
	}

	public static void setRecipeList(List<Recipe> l) {
		recipeList = l;
	}

	public static void process() {


		try {

			//Get the DOM Builder Factory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			//Get the DOM Builder
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Load and Parse the XML document
			//document contains the complete XML as a Tree.
			Document document = builder.parse(new File("res/values/recipes.xml"));
			//Iterating through the nodes and extracting the data.
			NodeList nodeList = document.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);

				if (node instanceof Element) {

					Recipe recipe = new Recipe();

					//gets recipe name from ID field
					recipe.setName(node.getAttributes().getNamedItem("id").getNodeValue());

					NodeList childNodes = node.getChildNodes();

					List<String> ingredients = new ArrayList<String>();
					List<String> instructions = new ArrayList<String>();

					for (int j = 0; j < childNodes.getLength(); j++) {

						Node cNode = childNodes.item(j);
						Element e;

						if (cNode instanceof Element) {

							String content = cNode.getLastChild().getTextContent().trim();

							if (cNode.getNodeName().equals("description")) {
								recipe.setDescription(content);
							}
							else if (cNode.getNodeName().equals("time")) {
								recipe.setPrepTime(content);
							}
							else if (cNode.getNodeName().equals("servings")) {
								recipe.setServings(content);
							}
							else if (cNode.getNodeName().equals("ingredients") || cNode.getNodeName().equals("instructions")) {
								//populates ingredients/instructions
								e = (Element) cNode;
								NodeList l = e.getChildNodes();

								for (int k = 0; k < l.getLength(); k++) {

									Node n = l.item(k);

									if (n instanceof Element) {

										content = n.getLastChild().getTextContent().trim();

										if (n.getNodeName().equals("ingredient")) {
											ingredients.add(content);
										}
										else if (n.getNodeName().equals("step")) {
											instructions.add(content);
										}
									}
								}
								break;
							}
						}
					}
					recipe.setIngredients(ingredients);
					recipe.setInstructions(instructions);
					recipeList.add(recipe);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}