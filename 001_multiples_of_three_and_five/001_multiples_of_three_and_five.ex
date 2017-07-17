# Finds multiples of three or five below a given number, 
#   and finds the sum of the multiples
defmodule MultiplesThreeFive do
  def sum(below_num) do
    range = 1..(below_num - 1)
    IO.puts Enum.filter(range, fn(x) -> rem(x, 3) == 0 || rem(x, 5) == 0 end)
      |> Enum.reduce(fn(sum, num) -> sum + num end)
  end
end

# Used to track time
defmodule Benchmark do
  def measure(function) do
    function
    |> :timer.tc
    |> elem(0)
    |> Kernel./(1_000_000)
  end
end

IO.puts Benchmark.measure(fn -> MultiplesThreeFive.sum(1000) end)