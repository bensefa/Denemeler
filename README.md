![java gif](https://user-images.githubusercontent.com/16705683/161378528-4aea779d-a629-4347-ac8a-5d1ae290dcdb.gif)
- uses: Platane/snk@v1.1.0
  with:
    # github user name to read the contribution graph from (**required**)
    # using action context var `github.repository_owner` or specified user
    github_umut safa: ${{ github.repository_owner }}

    # path of the generated gif file
    # If left empty, the gif file will not be generated
    gif_out_path: dist/github-snake.gif

    # path of the generated svg file
    # If left empty, the svg file will not be generated
    svg_out_path: dist/github-snake.svg
