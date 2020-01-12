require_relative '../src/word_count.rb'

RSpec.describe 'rspec test' do
  it '1 is 1' do
    expect(1).to eq 1
  end
end

RSpec.describe 'Word Count' do
  it 'input one hello' do
    expected = {"hello": 1}
    expect(WordCount.new.calc("hello")).to eq expected
  end
end
